package job_java.communication_method.abs_comm_method;

import job_java.communication_method.interface_comm_method.InterfaceAdress;
import job_java.communication_method.interface_comm_method.InterfaceEmail;
import job_java.communication_method.interface_comm_method.InterfacePhoneNumber;
import job_java.communication_method.interface_comm_method.InterfaceTelegram;
import job_java.communication_method.interface_comm_method.InterfaceVk;

public class AbstractListCommunicationMethod implements InterfaceVk, InterfaceTelegram, InterfaceEmail,
                                                        InterfacePhoneNumber, InterfaceAdress{

    @Override
    public void vkMethod(){}

    @Override
    public void telegramMethod(){}

    @Override
    public void emailMethod(){}

    @Override
    public void phoneNumberMethod(){}

    @Override
    public void adressMethod() {}
}
