package ma.zakariae.abdouni.accountdataservice.mapper;

import ma.zakariae.abdouni.accountdataservice.model.Customer;
import ma.zakariae.abdouni.customerdataservice.stub.CustomerServiceGrpc;
import ma.zakariae.abdouni.customerdataservice.stub.CustomerServiceOuterClass;
import ma.zakariae.abdouni.customerdataservice.web.CustomerById;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {
    private ModelMapper modelMapper=new ModelMapper();
    public Customer fromSoapCustomer(ma.zakariae.abdouni.customerdataservice.web.Customer soapCustomer){
        return modelMapper.map(soapCustomer,Customer.class);
    }
    public Customer fromGrpcCustomer(CustomerServiceOuterClass.Customer grpcCustomer){
        return modelMapper.map(grpcCustomer, Customer.class);
    }
}
