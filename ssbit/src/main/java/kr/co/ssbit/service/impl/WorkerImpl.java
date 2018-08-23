// 업무로직 구현체 - 고객사 마다 다른 구현을 할 수 있다.
package kr.co.ssbit.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import kr.co.ssbit.dao.WorkerDao;
import kr.co.ssbit.domain.Worker;
import kr.co.ssbit.service.WorkerService;



@Service
public class WorkerImpl implements WorkerService {
    
    WorkerDao workerDao;
    
    public WorkerImpl(WorkerDao workerDao) {
        this.workerDao = workerDao;
    }
    
    @Override
    public List<Worker> list(int pageNo, int pageSize) {
        HashMap<String,Object> params = new HashMap<>();
        params.put("startRowNo", (pageNo - 1) * pageSize);
        params.put("pageSize", pageSize);
        
        return workerDao.selectList(params);
    }
    
    @Override
    public Worker get(int no) {
        return workerDao.selectOne(no);
    }
    
    @Override
    public int add(Worker worker) {
        return workerDao.insert(worker);
    }
    
    @Override
    public int update(Worker worker) {
        return workerDao.update(worker);
    }
    
    @Override
    public int delete(int no) {
        return workerDao.delete(no);
    }
}
