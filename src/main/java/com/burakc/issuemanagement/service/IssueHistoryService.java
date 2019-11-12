package com.burakc.issuemanagement.service;

import com.burakc.issuemanagement.entity.Issue;
import com.burakc.issuemanagement.entity.IssueHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueHistoryService {

   IssueHistory save(IssueHistory issueHistory);

   IssueHistory getById(Long id);

   Page<IssueHistory> getAllPageable(Pageable pageable);

   Boolean delete(IssueHistory issueHistory);



}
