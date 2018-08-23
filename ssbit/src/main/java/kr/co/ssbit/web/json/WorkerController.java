package kr.co.ssbit.web.json;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import kr.co.ssbit.domain.Worker;
import kr.co.ssbit.service.WorkerService;

@RestController
@RequestMapping("/worker")
public class WorkerController {
    
    WorkerService workerService;
    
    public WorkerController(WorkerService workerService) {
        this.workerService = workerService;
    }

    @RequestMapping("add")
    @ResponseStatus(HttpStatus.CREATED)
    public int add(Worker management) throws Exception {
        return workerService.add(management);
    }
    
    @RequestMapping("delete")
    //@ResponseStatus(HttpStatus.OK) // 응답 상태 코드 값의 기본은 "200(OK)" 이다.
    public void delete(@RequestParam("no") int no) throws Exception {
        workerService.delete(no);
    }
    
    @RequestMapping("list{page}")
    public Object list(
            @MatrixVariable(defaultValue="1") int pageNo,
            @MatrixVariable(defaultValue="10") int pageSize) {        
        return workerService.list(pageNo, pageSize);
    }
    
    @RequestMapping("update")
//    @ResponseStatus(HttpStatus.OK) // 기본 값이 OK 이다. 
    public int update(Worker management) throws Exception {
        return workerService.update(management);
    }
    
    @RequestMapping("{no}")
    public Worker view(@PathVariable int no) throws Exception {
        return workerService.get(no);
    }
}

