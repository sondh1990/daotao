package daotao.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service

public class JwtUserDetailsService implements UserDetailsService {
	private static final String USER_NAME = "sondh";
	// pas nay da ma hoa theo thuat toan Bcrypt:  pass: abc123@
    private static final String PASSWORD = "$2a$12$LkjJOxbc1sqlYW0Ownn1fuoZ3RrbzQMzolb.WxNjed1P8b1AJC8gm";

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        if (USER_NAME.equals(s)){
            return new User(USER_NAME, PASSWORD, new ArrayList<>());
        }

        throw new UsernameNotFoundException(s);
    }
}
