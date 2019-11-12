package com.burakc.issuemanagement.api;


import com.burakc.issuemanagement.dto.IssueDto;
import com.burakc.issuemanagement.service.impl.IssueServiceImpl;
import com.burakc.issuemanagement.util.ApiPaths;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(ApiPaths.IssueCtrl.CTRL)
@Api(value = ApiPaths.IssueCtrl.CTRL)
public class IssueController {

    private final IssueServiceImpl issueServiceImpl;

    public IssueController(IssueServiceImpl issueServiceImpl){

        this.issueServiceImpl = issueServiceImpl;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Get By Id Operation", response = IssueDto.class)
    public ResponseEntity<IssueDto> getById(@PathVariable(value = "id", required = true) Long id){
        IssueDto projectDto = issueServiceImpl.getById(id);
        return ResponseEntity.ok(projectDto);


    }
    @PostMapping
    @ApiOperation(value = "Create Id Operation", response = IssueDto.class)
    public ResponseEntity<IssueDto> createProject(@Valid @RequestBody IssueDto project){
      return ResponseEntity.ok(issueServiceImpl.save(project))  ;

    }

    @PutMapping("/{id}")
    @ApiOperation(value = "Update Id Operation", response = IssueDto.class)
    public ResponseEntity<IssueDto> updateProject(@PathVariable(value = "id", required = true) Long id, @Valid @RequestBody IssueDto project){
       return ResponseEntity.ok(issueServiceImpl.update(id,project));

    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Delete Operation", response = IssueDto.class)
    public ResponseEntity<Boolean> delete(@PathVariable(value = "id", required = true) Long id){
        return ResponseEntity.ok(issueServiceImpl.delete(id));

    }
}
