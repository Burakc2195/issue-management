package com.burakc.issuemanagement.service;

import com.burakc.issuemanagement.dto.ProjectDto;
import com.burakc.issuemanagement.util.TPage;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProjectService {

   ProjectDto save(ProjectDto project);

   ProjectDto getById(Long id);

   ProjectDto getByProjectCode(String projectCode);

   List<ProjectDto> getByProjectCodeContains(String projectCode);

   List<ProjectDto> getAllPageable(String projectCode);

   TPage<ProjectDto> getAllPageable(Pageable pageable);

   Boolean delete(ProjectDto project);


   ProjectDto update(Long id, ProjectDto project);
}
