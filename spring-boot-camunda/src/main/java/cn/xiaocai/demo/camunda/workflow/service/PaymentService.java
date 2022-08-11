package cn.xiaocai.demo.camunda.workflow.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public String getPaymentInfo(String paymentId){
        return paymentId;
    }
}
