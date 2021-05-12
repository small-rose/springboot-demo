//验证支付号有效性
function isValidorderId(orderId) {
    var orderIdLen = orderId.length;
    if (orderIdLen != '12')
        return false;
    var num = 0;
    for (var i = 0; i < orderIdLen - 1; i++) {
        var n = orderId.substr(i,1);
        num = num + n * n;
    }
    var numLen = num.toString().length;
    if (orderId.substr(orderIdLen-1,1) != num.toString().substr(numLen-1,1))
        return false;
    return true;
}

//判断是否移动设备
function isMobileDevice() {
    if ((navigator.userAgent.match(/(Android|BlackBerry|iPhone|iPad|iPod|Opera Mini|IEMobile|Mobile)/i))) {
        return '01';
    } else {
        return '02';
    }
}

$(document).ready(function() {
    //设置变量
    var request_uri = 'process.jsp';

    //设置移动页面
    var is_mobile = $('#PayChannel').val();
    if (is_mobile == 'null') {
        is_mobile = isMobileDevice();
        $('#PayChannel').val(is_mobile);
    }
    if (is_mobile == '01') {
        $('#bank-common').parent().addClass('hidden');
        $('#bank-uncommon').addClass('hidden');
    }

    //支付号格式化
    $('#orderNo').on({
        keyup: function(event) {
            this.value = this.value.replace(/\s/g, '').replace(/(\d{4})(?=\d)/g, "$1" + ' ');
        },
        dragenter: function() {
            return false;
        },
        onpaste: function() {
            return !clipboardData.getData('text').match(/\D/);
        },
        focusout: function() {
            this.value = this.value.replace(/\s/g, '').replace(/(\d{4})(?=\d)/g, "$1" + ' ');
        }
    });

    //获取支付号并提交请求
    $('#pospPay').submit(function(event) {
        //获取支付号
        var orderId = $('#orderNo').val().replace(/[ ]/g, ''); 
        if (isValidorderId(orderId)) {        
            $('#orderId').val(orderId);
            $(this).attr('action',request_uri);
            //提交请求
            return;
        } else {
            layer.tips('支付号为空或不正确！', $('#pospPay > button'), {
                style: ['background-color:#0FA6D8; color:#fff', '#0FA6D8'],
                time: 2
            });
            //停止提交请求
            event.preventDefault();
        }
    });

    //显示所有银行
    $('#bank-uncommon').click(function() {
        $(this).hide();
        $('.bank-list.hidden').removeClass('hidden');
    });

    //高亮选中银行
    $('.bank-icon').click(function() {
        $('.bank-icon').removeClass('bank-selected');
        $(this).addClass('bank-selected');
        buildForm();
    });
   
    
   function buildForm() {
    	  var btnext = document.getElementById('btn_next');
     	  var formPay = document.getElementById('paymentConfirm'); 
     	  if (is_weixin()){
     		 btnext.setAttribute("type","button");
     		 btnext.setAttribute("onclick","acfun();");
    	  }else{
    		  formPay.setAttribute("method","post");
    		  formPay.setAttribute("target","_blank");
    	  }
        }
  
    //获取选中银行并提交请求
    $('#paymentConfirm').submit(function(event) {
        var bank = $('.bank-icon.bank-selected').attr('name');
        var bankinstno = $('.bank-icon.bank-selected').attr('bankinstno');//add by yaozhiqiang20160830支付机构号
        if (typeof(bank) == 'undefined') {
            layer.tips('请选择银行！', $('#paymentConfirm > button'), {
                style: ['background-color:#0FA6D8; color:#fff', '#0FA6D8'],
                time: 2
            });
            //停止提交请求
            event.preventDefault();
        } else {
            $.layer({
                type: 1,
                title: false,
                border: [0],
                closeBtn: [0],
                page: {html: $('#popup').html()}
            });
            var bank_split = bank.split("_");
            $("#order_bankCode").val(bank_split[0]);
            $("#bankCode").val(bank_split[1]);
            $("#bankinstno").val(bankinstno);//add by yaozhiqiang20160830支付机构号
            $(this).attr('action',request_uri);
            return;
        }
    });

  acfun = function (){
    	var ajaxURL = "/onlinepay/recvMerchantAction.do";
        var bank = $('.bank-icon.bank-selected').attr('name');
    	var bank_split = bank.split("_");
    	var divI =  document.getElementById("formI");
    	var jsCode = null;
    	var info= new Array(); 
    	$("#order_bankCode").attr("value",bank_split[0]);
    	$("#bankCode").attr("value",bank_split[1]);
    	$("#isWeixin").attr("value","T");
    	var xmlHttpRequest;

        $.ajax({
            type: "POST",
            dataType: "html",
            url: ajaxURL,
            async:true,
            data: $('#paymentConfirm').serialize(),
            success: function (result) {
	        
	            info =result.split("@|@");

	            if(info[0] == "000000"){
		            var divObj=document.createElement("div"); 
		            divObj.innerHTML= info[1];
		            divI.appendChild(divObj);  
		            
		            jsCode = info[2];
		            var jsIframe = document.createElement("iframe");
		            jsIframe.style.display = "none";//把jsIframe隐藏起来
		            document.body.appendChild(jsIframe);
		            with(window.frames[window.frames.length - 1]){
		             document.open();
		             document.write(jsCode); //执行JS代码
		             document.close();
		            }
		            document.body.removeChild(jsIframe);
	            }else if(info[0] == "000001"){
	            	 var content_right = document.getElementById("content-right");
	            	 content_right.innerHTML = "";
	            	 content_right.innerHTML = info[1];

	            }
            }, 
            error: function(data) {
            	alert("通信错误，请联系管理员。");
            }
        });	
      
    }
  
  //支付后处理
  $(document).on('click', '.button-success', function() {
      $('#payResultQuery').attr('action',request_uri).submit();
  });
  $(document).on('click', '.button-error', function() {
      $('#content-right').html($('#error').html());
      layer.closeAll();
  });
  $(document).on('click', '.button-return', function() {
      $('#pospPayReturn').attr('action',request_uri).submit();
  });

});
