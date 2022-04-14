package services;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import akka.testkit.javadsl.TestKit;
import org.mockito.MockitoAnnotations;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.org.apache.bcel.internal.generic.NEW;

import play.libs.ws.*;
import akka.actor.ActorSystem;
import akka.actor.*;
import static org.hamcrest.CoreMatchers.*;

import java.io.*;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import services.FreeLancelotWordStatsActor.*;
import play.libs.ws.WSClient;


public class FreelancelotActorTest {
    @Mock
    private WSClient ws;

    @Mock
    static ActorSystem systemMock;

    // @InjectMocks private StatisticsHelper help;

    @Before
    public void setup() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    /**
     * This is a unit test method for the test SearchHelperActor 
     */
    @Test
    public void testWordActor() throws InterruptedException, ExecutionException, JsonProcessingException,
            InterruptedIOException, IOException {
        
        systemMock = ActorSystem.create();
        new TestKit(systemMock) {
            {
                final ActorRef tar = systemMock.actorOf(FreeLancelotWordStatsActor.props(ws));
                tar.tell(new FreeLancelotWordStatsActor.wordStatsActorClass("java"), getRef());

            }
        };
    }


}

