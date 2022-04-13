package services;

import akka.actor.AbstractLoggingActor;
import play.libs.ws.*;
import akka.actor.ActorRef;
import akka.actor.Props;
import dao.UserProjectDisplay;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.inject.Inject;
import com.fasterxml.jackson.databind.DeserializationFeature;

/** This Actor class holds logic which is used by the controller to fetch the User Projects with the help of owner_id
 * @author  Gagandeep Kaur
 * @version 1.0
 * @since 1.0
*/
public class UserProjectDisplayActor extends AbstractLoggingActor{
	
	ObjectMapper mapper;
	private final WSClient ws;

	@Inject
	public UserProjectDisplayActor(WSClient ws) {
		this.ws = ws;
	    mapper = new ObjectMapper();
	    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	        //context.getLog().info("Device actor {}-{} started");
	}
	
	public static class UserProjectActorClass {
		final private int owner_id;

        public UserProjectActorClass(int owner_id) {
            this.owner_id = owner_id;
        }
	}
	
	public static Props props(WSClient ws) {
        return Props.create(UserProjectDisplayActor.class, ws);
    }
	
	@Override
	public Receive createReceive() {
		return receiveBuilder()
                .match(UserProjectDisplayActor.UserProjectActorClass.class, this::userProj)
                .build();
	}
	
	/** This method is used to get the User Project data from API and send to frontend
	 * @author  Gagandeep Kaur
	 * @return it returns the List of UserProjectDetails which is used by the response
	 * @version 1.0
	 * @since 1.0
	*/
	public void userProj(UserProjectActorClass obj) {
	    final ActorRef senderRef = sender();
	    
	    try {
	    	FreeLancelotService.getUserProjects(obj.owner_id)
	    	.thenAccept(response -> senderRef.tell((List<UserProjectDisplay>) response, self()));
	    } catch (Exception ex) {
            System.out.println("User Project !!!!!!   - Exception :" + ex);
        }
	}
}


