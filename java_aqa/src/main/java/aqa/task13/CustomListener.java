package aqa.task13;

import org.testng.*;

public class CustomListener implements ITestListener, ISuiteListener, IExecutionListener {
//    V3. ITestListener method task (2, 7); ISuiteListener, IExecutionListener,IInvoke...(3, 4)

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println(result.getName());
        ITestListener.super.onTestSuccess(result);
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println(context.getName());
        ITestListener.super.onStart(context);
    }
}
