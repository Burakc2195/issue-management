package com.burakc.issuemanagement.repository;

import com.burakc.issuemanagement.entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;


public interface ProjectRepository extends JpaRepository<Project,Long> {

    Project getByProjectCode (String projectCode);

    Project getByProjectCodeAndIdNot(String projectCode, Long id);

    List<Project> getAllByProjectCodeAndProjectNameContains(String projectCode, String name);

    Page<Project> findAll(Pageable pageable);

    List<Project> findAll(Sort sort);
}
