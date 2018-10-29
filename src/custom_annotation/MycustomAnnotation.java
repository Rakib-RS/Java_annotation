package custom_annotation;
public @interface MycustomAnnotation {
	 int studentAge() default 18;
	 String studentName();
	 String stuAddress();
	 String stuStream() default "CSE";
	 
}
