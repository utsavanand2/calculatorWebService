package calculator;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationController {
    private static final String template = "%s %s %s = %s";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/calculate")
    public Operation operate(@RequestParam(value="operand1") String operand1, 
                            @RequestParam(value="operator") String operator, 
                            @RequestParam(value="operand2") String operand2) {
                                int result;
                                int operand1int = Integer.parseInt(operand1);
                                int operand2int = Integer.parseInt(operand2);
                                switch (operator) {
                                    case "add":
                                        result = operand1int + operand2int;
                                        break;
                                    case "sub":
                                        result = operand1int - operand2int;
                                        break;
                                    case "mul":
                                        result = operand1int * operand2int;
                                        break;
                                    case "div":
                                        result = operand1int / operand2int;
                                        break;
                                    default:
                                        result = 0;
                                }

                                String resultString = Integer.toString(result);

                                return new Operation(counter.incrementAndGet(),
                                                        String.format(template, operand1, operator, operand2, resultString));
                            }
        
}