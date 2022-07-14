package integrativeproject.digitalbooking.repository.security;

import integrativeproject.digitalbooking.security.enums.RoleName;
import integrativeproject.digitalbooking.model.entity.security.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{

    Optional<Role> findByRoleName(RoleName roleName);
}
