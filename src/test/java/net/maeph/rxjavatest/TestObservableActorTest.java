package net.maeph.rxjavatest;

import akka.actor.ActorSelection;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.actor.UntypedActor;
import akka.testkit.TestActorRef;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestObservableActorTest {

    static ActorSystem system;

    
    
    @BeforeClass
    public static void setup() {
        system = ActorSystem.create();
    }


    @Test
    public void shouldNotProvideAnyMessagesUponInitiation() throws Throwable {
        final Props props = Props.create(TestObservableActor.class);
        final TestActorRef<TestObservableActor> ref = TestActorRef.create(system, props, "testObservable");
        
        final TestObservableActor observableActor = ref.underlyingActor();
        

    }
    
    
    private static class TestObservingActor extends UntypedActor {

        @Override
        public void onReceive(Object o) throws Exception {
            ActorSelection test = system.actorSelection("test");
            
        }
    }
}
