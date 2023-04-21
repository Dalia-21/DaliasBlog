/*
 * Dalia Sinclair
 * BlogApplication class
 * Main entrypoint for Spring Framework
 */

package com.daliasblog.Blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}
}
