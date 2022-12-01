package com.ultras.footbalticketsapp.mapper;

import com.ultras.footbalticketsapp.controller.user.RegisterUserRequest;
import com.ultras.footbalticketsapp.controller.user.UpdateUserRequest;
import com.ultras.footbalticketsapp.controller.user.UserDTO;
import com.ultras.footbalticketsapp.model.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-14T16:00:37+0100",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.jar, environment: Java 17.0.4.1 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User registerUserRequestToUser(RegisterUserRequest registerUserRequest) {
        if ( registerUserRequest == null ) {
            return null;
        }

        User user = new User();

        user.setFirst_name( registerUserRequest.getFirst_name() );
        user.setLast_name( registerUserRequest.getLast_name() );
        user.setPhone_number( registerUserRequest.getPhone_number() );
        user.setEmail( registerUserRequest.getEmail() );
        user.setPassword( registerUserRequest.getPassword() );

        return user;
    }

    @Override
    public User userDTOtoUser(UserDTO UserDTO) {
        if ( UserDTO == null ) {
            return null;
        }

        User user = new User();

        user.setId( UserDTO.getId() );
        user.setFirst_name( UserDTO.getFirst_name() );
        user.setLast_name( UserDTO.getLast_name() );
        user.setPhone_number( UserDTO.getPhone_number() );
        user.setEmail( UserDTO.getEmail() );
        user.setRole( UserDTO.getRole() );

        return user;
    }

    @Override
    public User updateUserRequestToUser(UpdateUserRequest updateUserRequest) {
        if ( updateUserRequest == null ) {
            return null;
        }

        User user = new User();

        user.setId( updateUserRequest.getId() );
        user.setFirst_name( updateUserRequest.getFirst_name() );
        user.setLast_name( updateUserRequest.getLast_name() );
        user.setPhone_number( updateUserRequest.getPhone_number() );
        user.setEmail( updateUserRequest.getEmail() );

        return user;
    }

    @Override
    public UserDTO userToUserDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( user.getId() );
        userDTO.setFirst_name( user.getFirst_name() );
        userDTO.setLast_name( user.getLast_name() );
        userDTO.setPhone_number( user.getPhone_number() );
        userDTO.setEmail( user.getEmail() );
        userDTO.setRole( user.getRole() );

        return userDTO;
    }

    @Override
    public List<UserDTO> usersToUsersDTO(List<User> user) {
        if ( user == null ) {
            return null;
        }

        List<UserDTO> list = new ArrayList<UserDTO>( user.size() );
        for ( User user1 : user ) {
            list.add( userToUserDTO( user1 ) );
        }

        return list;
    }
}
