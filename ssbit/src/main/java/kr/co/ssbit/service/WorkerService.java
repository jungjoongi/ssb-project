// 서비스 컴포넌트 - 게시물 관련 업무를 처리할 객체
package kr.co.ssbit.service;

import java.util.List;

import kr.co.ssbit.domain.Worker;


public interface WorkerService {
    // 서비스 컴포넌트에서 메서드명을 지을 때는 
    // 업무 용어를 사용하라!
    List<Worker> list(int pageNo, int pageSize);
    Worker get(int no);
    int add(Worker worker);
    int update(Worker worker);
    int delete(int no);
}







