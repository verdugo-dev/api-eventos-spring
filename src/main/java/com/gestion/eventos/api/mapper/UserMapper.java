package com.gestion.eventos.api.mapper;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.gestion.eventos.api.domain.Role;
import com.gestion.eventos.api.domain.User;
import com.gestion.eventos.api.dto.RegisterDto;
import com.gestion.eventos.api.repository.RoleRepository;

@Mapper(componentModel = "spring")
public abstract class UserMapper {

    protected final RoleRepository roleRepository;

    UserMapper(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Mapping(target = "password", ignore = true)
    @Mapping(target = "id", ignore = true)
    public abstract User registerDtoToUser(RegisterDto registerDto);

    public Set<Role> mapRoleStringsToRoles(Set<String> roleNames) {
        if (roleNames == null || roleNames.isEmpty()) {
            return roleRepository.findByName("ROLE_USER")
                .map(Collections::singleton)
                .orElseThrow(
                    () -> new RuntimeException("Error: Rol 'ROLE_USER' no encontrado en la base de datos. " +
                        "Asegurate de que el rol ROLE_USER exista al iniciar la aplicacion"
                    )
                );
        }

        return roleNames.stream()
            .map(
                roleName -> roleRepository.findByName(roleName)
                    .orElseThrow(
                        () -> new RuntimeException("Error: Rol no encontrado: " + roleName)
                    )
            )
            .collect(Collectors.toSet());

    }

}
