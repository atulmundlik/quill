package com.eclectic.quill.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

/**
 * 
 * @author atul_mundlik
 *
 */

@SpringBootApplication
public class QuillConfig {// extends WebSecurityConfigurerAdapter{

	public static void main(String[] args) {
		SpringApplication.run(QuillConfig.class, args);
	}

	@Bean
	public MongoTemplate mongoTemplate(MongoDbFactory mongoDbFactory,
			MongoMappingContext context) {

		MappingMongoConverter converter = new MappingMongoConverter(
				new DefaultDbRefResolver(mongoDbFactory), context);
		converter.setTypeMapper(new DefaultMongoTypeMapper(null));

		MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory,
				converter);

		return mongoTemplate;

	}
	/*
	 * @Autowired
	 * 
	 * @Qualifier("customUserDetailsService") UserDetailsService
	 * userDetailsService;
	 * 
	 * @Autowired PersistentTokenRepository tokenRepository;
	 * 
	 * @Autowired public void
	 * configureGlobalSecurity(AuthenticationManagerBuilder auth) throws
	 * Exception { auth.userDetailsService(userDetailsService);
	 * auth.authenticationProvider(authenticationProvider()); }
	 * 
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * http.authorizeRequests().antMatchers("/", "/list")
	 * .access("hasRole('USER') or hasRole('ADMIN') or hasRole('DBA')")
	 * .antMatchers("/newuser/**",
	 * "/delete-user-*").access("hasRole('ADMIN')").antMatchers("/edit-user-*")
	 * .
	 * access("hasRole('ADMIN') or hasRole('DBA')").and().formLogin().loginPage(
	 * "/login")
	 * .loginProcessingUrl("/login").usernameParameter("ssoId").passwordParameter
	 * ("password").and()
	 * .rememberMe().rememberMeParameter("remember-me").tokenRepository
	 * (tokenRepository)
	 * .tokenValiditySeconds(86400).and().csrf().and().exceptionHandling
	 * ().accessDeniedPage("/Access_Denied"); }
	 * 
	 * @Bean public PasswordEncoder passwordEncoder() { return new
	 * BCryptPasswordEncoder(); }
	 * 
	 * @Bean public DaoAuthenticationProvider authenticationProvider() {
	 * DaoAuthenticationProvider authenticationProvider = new
	 * DaoAuthenticationProvider();
	 * authenticationProvider.setUserDetailsService(userDetailsService);
	 * authenticationProvider.setPasswordEncoder(passwordEncoder()); return
	 * authenticationProvider; }
	 * 
	 * @Bean public PersistentTokenBasedRememberMeServices
	 * getPersistentTokenBasedRememberMeServices() {
	 * PersistentTokenBasedRememberMeServices tokenBasedservice = new
	 * PersistentTokenBasedRememberMeServices( "remember-me",
	 * userDetailsService, tokenRepository); return tokenBasedservice; }
	 * 
	 * @Bean public AuthenticationTrustResolver getAuthenticationTrustResolver()
	 * { return new AuthenticationTrustResolverImpl(); }
	 */
}
