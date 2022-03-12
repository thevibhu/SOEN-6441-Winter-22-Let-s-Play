package dao;

import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodySubscriber;
import java.net.http.HttpResponse.ResponseInfo;
import java.util.function.Supplier;

import com.fasterxml.jackson.databind.ObjectMapper;

public class BodyHandler<T> implements HttpResponse.BodyHandler<Supplier<T>> {

    private static final ObjectMapper om = new ObjectMapper();
    private final Class<T> targetClass;

    public BodyHandler(Class<T> targetClass) {
        this.targetClass = targetClass;
    }

	@Override
	public BodySubscriber<Supplier<T>> apply(ResponseInfo responseInfo) {
		// TODO Auto-generated method stub
		return null;
	}
    
}