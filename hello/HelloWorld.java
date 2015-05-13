import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;
import rx.functions.Func1;

public class HelloWorld {

    public static void main(String[] args) {
    	/*
		Observable<String> myObservable = Observable.create(
		    new Observable.OnSubscribe<String>() {
		        @Override
		        public void call(Subscriber<? super String> sub) {
		            sub.onNext("Hello, world!");
		            sub.onCompleted();
		        }
		    }
		);
		Subscriber<String> mySubscriber = new Subscriber<String>() {
		    @Override
		    public void onNext(String s) { System.out.println(s); }

		    @Override
		    public void onCompleted() { }

		    @Override
		    public void onError(Throwable e) { }
		};
		myObservable.subscribe(mySubscriber);
*/
		/*
		Observable<String> myObservable =
    		Observable.just("Hello, world!");
		Action1<String> onNextAction = new Action1<String>() {
		    @Override
		    public void call(String s) {
		        System.out.println(s);
		    }
		};
		myObservable.subscribe(onNextAction);
*/
/*
		Observable.just("Hello, world!")
		    .subscribe(s -> System.out.println(s));
*/
/*
	    Observable.just("Hello, world!")
	    .map(new Func1<String, String>() {
	        @Override
	        public String call(String s) {
	            return s + " -Dan";
	        }
	    })
	    .subscribe(s -> System.out.println(s));
*/
		Observable.just("Hello, world!")
		    .map(s -> s + " -Dan")
		    .subscribe(s -> System.out.println(s));

    }

}