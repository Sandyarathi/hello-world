package hello

import org.springframework.context.annotation.{Configuration, ComponentScan}
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.ResponseBody; 
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RestController; 

/**
 * This config class will trigger Spring @annotation scanning and auto configure Spring context.
 *
 * @author sandyarathi_das
 * @since 1.0
 */
@RestController
//@Controller
//@ResponseMapping
@Configuration
@EnableAutoConfiguration
@ComponentScan
class HelloConfig {
  
  @ResponseBody
  @RequestMapping(Array("/"))
  def home(): String="Hello World!"

}