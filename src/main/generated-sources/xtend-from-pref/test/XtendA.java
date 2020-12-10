package test;

@SuppressWarnings("all")
public class XtendA extends JavaB {
  public JavaB test2(final XtendC s) {
    return this.foo(s).newJavaB();
  }
  
  public JavaB newJavaB() {
    return new JavaB();
  }
}
