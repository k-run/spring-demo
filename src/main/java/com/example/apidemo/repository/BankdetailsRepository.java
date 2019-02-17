package com.example.apidemo.repository;

import com.example.apidemo.model.BankDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by karanc on 14-02-2019.
 */

@Repository
public interface BankdetailsRepository extends JpaRepository<BankDetails,String> {
    /**
     * Finds all branch details by ifsc code
     * @param bank_ifsc
     * @return List
     */

    @Query(value = "select u.bank_id, u.bank_name, " +
            "u.bank_ifsc, u.bank_branch, u.bank_address, u.bank_city, u.bank_district, u.bank_state from bank_details u where u.bank_ifsc=?1",
            nativeQuery = true)
    List<BankDetails> getBranchDetailsByIFSC(String bank_ifsc);

    /**
     * Finds all branches in city
     * @param bank_name
     * @param bank_city
     * @return List
     */

    @Query(value = "select u.bank_id, u.bank_name, " +
            "u.bank_ifsc, u.bank_branch, u.bank_address, u.bank_city, u.bank_district, u.bank_state from bank_details u where u.bank_name=?1 and u.bank_city=?2",
            nativeQuery = true)
    List<BankDetails> getAllBranchesInCity(String bank_name, String bank_city);
}
