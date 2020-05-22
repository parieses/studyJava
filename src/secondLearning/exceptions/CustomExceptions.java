package secondLearning.exceptions;

/**
 * 自定义异常类 必须Exception 结尾 必须继承Exception或者runtimeException
 */
public class CustomExceptions extends Exception {
    public CustomExceptions() {
        super();
    }

    public CustomExceptions(String message) {
        super(message);
    }
}
