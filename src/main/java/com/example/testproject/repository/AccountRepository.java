package com.example.testproject.repository;

import com.example.testproject.model.Account;
import com.example.testproject.enums.EAccountStatus;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    @Query(
            value = "select a.id " +
                    "from Account a " +
                    "where a.status = :status",
            countQuery = "select count (a) " +
                    "from Account a " +
                    "where a.status = :status"
    )
    List<Long> findAllAccountIdsByStatus(@Param("status") EAccountStatus status, Pageable pageable);

    @Query(
            value = "select a " +
                    "from Account a " +
                    "left join fetch a.companies " +
                    "where a.id in (:accountIds)"
    )
    List<Account> findAllByAccountIdsWithCompanies(@Param("accountIds") List<Long> accountIds);


    @Query(
            value = "select a " +
            "from Account a " +
            "left join fetch a.customers " +
            "where a.id in (:accountIds)"
    )
    List<Account> findAllByAccountIdsWithCustomers(@Param("accountIds") List<Long> accountIds);

    @Query(
            value = "select a " +
                    "from Account a " +
                    "left join fetch a.tariffs " +
                    "where a.id in (:accountIds)"
    )
    List<Account> findAllByAccountIdsWithTariffs(@Param("accountIds") List<Long> accountIds);
}
