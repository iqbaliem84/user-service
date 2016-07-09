package org.ihkhan.repository;

import org.ihkhan.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

@RepositoryRestResource
@Transactional
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
    User findUserByUsername(@Param("username") String username);
}
