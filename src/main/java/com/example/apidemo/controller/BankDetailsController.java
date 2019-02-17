package com.example.apidemo.controller;

import com.example.apidemo.exception.ResourceNotFoundException;
import com.example.apidemo.model.BankDetailRequestModel;
import com.example.apidemo.model.BankDetails;
import com.example.apidemo.repository.BankdetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by karanc on 14-02-2019.
 */
@RestController
public class BankDetailsController {

    @Autowired
    private BankdetailsRepository bankdetailsRepository;


    @GetMapping("/branch-details/{ifsc}")
    public List<BankDetails> getBranchDetails(@PathVariable String ifsc)
            throws ResourceNotFoundException{
        System.out.println("Hitting endpoint: " + "/branch-details/" + ifsc);

        return bankdetailsRepository.getBranchDetailsByIFSC(ifsc);
    }

    @PostMapping("/getAllBranches")
    public List<BankDetails> getAllBranchesInCity(@Valid @RequestBody BankDetailRequestModel bankDetailRequestModel)
            throws ResourceNotFoundException{
        System.out.println("Hitting endpoint: " + "/getAllBranches");
        System.out.println("RequestBody: " + bankDetailRequestModel.getBank_name() + bankDetailRequestModel.getBank_city());

        return bankdetailsRepository.getAllBranchesInCity(bankDetailRequestModel.getBank_name(), bankDetailRequestModel.getBank_city());
    }

}
