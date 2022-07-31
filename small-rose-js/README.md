##


### ads

adb connect 127.0.0.1:7555

adb devices

adb logcat > 1.log

adb shell "ps -ef | grep com.jianshu.haruki"


adb shell "logcat | grep 3621"

update mysql.user set authentication_string=password('root_password') where user='root';

root_Zhang@2022.cn


1.用ROOT登录，修改/etc/my.cnf　　
2.在[mysqld]下加入一行：
lower_case_table_names=1　　
3.重新启动数据库即可。


sql_mode=STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION