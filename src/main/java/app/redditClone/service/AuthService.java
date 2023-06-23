package app.redditClone.service;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.redditClone.dto.RegisterRequest;
import app.redditClone.model.User;
import app.redditClone.repository.UserRepository;

@Service
public class AuthService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void signup(RegisterRequest registerRequest) {
		User user = new User();
		user.setEmail(registerRequest.getEmail());
		user.setPassword(registerRequest.getPassword());
		user.setUsername(registerRequest.getUsername());
		user.setCreated(Instant.now());
		user.setEnabled(false);
		
		//before saving user to DB we need to encode the password
		userRepository.save(user);
	}

}
