package com.quanlytoanha.service;

import com.quanlytoanha.model.UserModel;

import java.util.List;

public interface IUserService {
    UserModel findByUserNameAndPasswordAndStatus(String userName, String password, int status);

    List<UserModel> findAll();

    List<UserModel> findByRoleId(long id);

    List<UserModel> findUserAssignForBuilding(long roleId , long buildingId);

}

