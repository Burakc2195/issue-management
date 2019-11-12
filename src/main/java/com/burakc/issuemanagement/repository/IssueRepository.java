package com.burakc.issuemanagement.repository;

import com.burakc.issuemanagement.entity.Issue;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository<Issue, Long> {

    Page<Issue> findAll(Pageable pageable);
}
