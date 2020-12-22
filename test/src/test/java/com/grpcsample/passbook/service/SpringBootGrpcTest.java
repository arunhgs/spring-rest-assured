
package com.grpcsample.passbook.service;

import com.grpcsample.BaseSpringBootTest;
import com.grpcsample.passbook.entity.Passbook;
import com.grpcsample.passbook.repository.PassbookRepository;
import com.sample.grpcsample.passbookService.PassbookRequest;
import com.sample.grpcsample.passbookService.PassbookResponseResponse;
import com.sample.grpcsample.passbookService.PassbookServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import java.util.Iterator;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SpringBootGrpcTest extends BaseSpringBootTest {

   @GrpcClient("passbook-service")
    private PassbookServiceGrpc.PassbookServiceBlockingStub  passbookServiceBlockingStub;

    @Autowired
    private PassbookRepository passbookRepository;

    @Test(groups = "integration")
    public void getTransactionHistory(){
        PassbookRequest passbookRequest = PassbookRequest.newBuilder().setUserId("1").build();
        PassbookResponseResponse passbookResponse =
                this.passbookServiceBlockingStub.getTransactionHistory(passbookRequest);
        passbookResponse.getPassbookDTOCount();
        assertNotNull(passbookResponse);
        assertEquals(2,passbookResponse.getPassbookDTOList().size());
    }

    @Test(groups = "integration", dataProvider = "passbookObjects")
    public void getTransactionHistoryDataDrivenDB(Passbook passbook){
        PassbookRequest passbookRequest = PassbookRequest.newBuilder().setUserId(passbook.getUserId()).build();
        PassbookResponseResponse passbookResponse =
                this.passbookServiceBlockingStub.getTransactionHistory(passbookRequest);
        System.out.println("passbookResponse " + passbookResponse);
        assertThat( passbookResponse.getPassbookDTOList(), hasItem(
                        hasProperty("txnAmount", is(passbook.getTxnAmount()))));
    }

    @DataProvider(name = "passbookObjects")
    public Iterator<Passbook> parameterProvider() {
        return passbookRepository.findAll().iterator();
    }


}



