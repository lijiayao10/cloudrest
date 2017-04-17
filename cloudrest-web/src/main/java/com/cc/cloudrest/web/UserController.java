//package com.cc.cloudrest.web;
//
//import java.util.HashMap;
//import java.util.List;
//
//import javax.annotation.Resource;
//
//import org.springframework.data.rest.webmvc.RepositorySearchesResource;
//import org.springframework.hateoas.Link;
//import org.springframework.hateoas.ResourceProcessor;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.cc.cloudrest.common.domain.User;
//import com.cc.cloudrest.service.core.UserService;
//import com.google.common.base.Optional;
//import com.google.common.collect.Lists;
//import com.google.common.collect.Maps;
//
//@RestController("/user")
//public class UserController implements ResourceProcessor<RepositorySearchesResource>  {
//	
//	@Resource
//	private UserService userService;
//	
//	@RequestMapping("/")
//	public List<HashMap<String, String>> list(){
//		HashMap<String, String> hashMap = Maps.newHashMap();
//		hashMap.put("K1", "V1");
//		hashMap.put("K2", "V2");
//		Optional<HashMap<String, String>> optional =  Optional.of(hashMap);
//		
//		return Lists.<HashMap<String,String>>newArrayList(optional.get());
//	}
//	
//	@RequestMapping("/{key}")
//	public String get(@PathVariable String key){
//		HashMap<String, String> hashMap = Maps.newHashMap();
//		hashMap.put("K1", "V1");
//		hashMap.put("K2", "V2");
//		return Optional.fromNullable(hashMap.get(key)).or("empty!!");
//	}
//	
//	@ResponseBody
//	@RequestMapping("/find/{username}")
//	public User find(@PathVariable String username){
//		return userService.get(username);
//	}
//
//	@Override
//	public RepositorySearchesResource process(RepositorySearchesResource resource) {
//		String href = resource.getId().getHref();  
//        resource.add(new Link(href + "/find{?username}")  
//                .withRel("find"));  
//        return resource;
//	}
//}
//
