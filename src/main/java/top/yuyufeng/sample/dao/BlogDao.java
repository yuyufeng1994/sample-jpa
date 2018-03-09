package top.yuyufeng.sample.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import top.yuyufeng.sample.domain.BlogInfo;
import top.yuyufeng.sample.domain.UserInfo;

/**
 * @author yuyufeng
 * @date 2018/3/9
 */
public interface BlogDao extends PagingAndSortingRepository<BlogInfo, Integer> {

}
