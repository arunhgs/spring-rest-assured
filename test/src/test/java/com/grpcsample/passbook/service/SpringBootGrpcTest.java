
package com.grpcsample.passbook.service;

import com.sample.grpcsample.passbookService.PassbookRequest;
import com.sample.grpcsample.passbookService.PassbookResponseResponse;
import com.sample.grpcsample.passbookService.PassbookServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.grpcsample.ClientApplication;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = ClientApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class SpringBootGrpcTest {

   @GrpcClient("passbook-service")
    private PassbookServiceGrpc.PassbookServiceBlockingStub  passbookServiceBlockingStub;

    @Test
    public void getTransactionHistory(){
        PassbookRequest passbookRequest = PassbookRequest.newBuilder().setUserId("1").build();
        PassbookResponseResponse passbookResponse =
                this.passbookServiceBlockingStub.getTransactionHistory(passbookRequest);
        passbookResponse.getPassbookDTOCount();
        assertNotNull(passbookResponse);
        assertEquals(2,passbookResponse.getPassbookDTOList().size());
    }

    @Test
    public void contextLoads() throws Exception {
        System.out.println("Hello.....");
    }
}



