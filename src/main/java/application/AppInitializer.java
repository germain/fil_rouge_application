<<<<<<< HEAD
package application;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override	protected Class<?>[] getRootConfigClasses() {		return new Class[] { App.class };	} 
	@Override	protected Class<?>[] getServletConfigClasses() {		return null;	}
	@Override	protected String[] getServletMappings() {		return new String[] { "/" };	}

=======
package application;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override	protected Class<?>[] getRootConfigClasses() {		return new Class[] { App.class };	} 
	@Override	protected Class<?>[] getServletConfigClasses() {		return null;	}
	@Override	protected String[] getServletMappings() {		return new String[] { "/" };	}

>>>>>>> 723622ee5438056a6455e4959f990d977615a556
}