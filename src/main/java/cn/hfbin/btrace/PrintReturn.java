package cn.hfbin.btrace;
import com.sun.btrace.AnyType;
import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.Kind;
import com.sun.btrace.annotations.Location;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.ProbeClassName;
import com.sun.btrace.annotations.ProbeMethodName;
import com.sun.btrace.annotations.Return;

@BTrace
public class PrintReturn {
	
	@OnMethod(
	        clazz="cn.hfbin.btrace.Ch4Controller",
	        method="arg1",
	        location=@Location(Kind.RETURN)
	)
	public static void anyRead(@ProbeClassName String pcn, @ProbeMethodName String pmn, @Return AnyType result) {
		BTraceUtils.println(pcn+","+pmn + "," + result);
		BTraceUtils.println();
    }
}
