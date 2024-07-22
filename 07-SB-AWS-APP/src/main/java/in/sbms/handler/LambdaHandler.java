package in.sbms.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaHandler implements RequestHandler<Object, String> {

	@Override
	public String handleRequest(Object input, Context context) {
		// TODO Auto-generated method stub
		return "Welcome to AWS (Invoked from AWS LAMBDA)";
	}

}
