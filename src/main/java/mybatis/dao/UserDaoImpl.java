package mybatis.dao;

import java.util.Date;
import java.util.List;

import mybatis.po.UserPage;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.po.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * 
 * <p>
 * Title: UserDaoImpl
 * </p>
 * <p>
 * Description:dao接口实现类
 * </p>
 * <p>
 * Company: www.itcast.com
 * </p>
 * 
 * @author 传智.燕青
 * @date 2015-4-22下午2:47:17
 * @version 1.0
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

//	// 需要向dao实现类中注入SqlSessionFactory
//	// 这里通过构造方法注入
//	private SqlSessionFactory sqlSessionFactory;
//
//	public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
//		this.sqlSessionFactory = sqlSessionFactory;
//	}
	@Override
	public User findUserById(int id) throws Exception {
		//SqlSession sqlSession = sqlSessionFactory.openSession();
		//ssm dao 获取sqlSession方式
		SqlSession sqlSession = this.getSqlSession();
		User user = sqlSession.selectOne("test.findUserById", id);
		return user;
	}
	
	@Override
	public List<User> findUserByName(String name) throws Exception {
		//SqlSession sqlSession = sqlSessionFactory.openSession();
		SqlSession sqlSession = this.getSqlSession();
		List<User> list = sqlSession.selectList("test.findUserByName", name);
		// 释放资源
		//sqlSession.close();
		return list;
	}
	@Override
	public void insertUser(User user) throws Exception {
		//SqlSession sqlSession = sqlSessionFactory.openSession();
		SqlSession sqlSession = this.getSqlSession();
		//执行插入操作
		sqlSession.insert("test.insertUser", user);
		// 提交事务
		sqlSession.commit();

		// 释放资源
		//sqlSession.close();
	}
	@Override
	public void deleteUser(int id) throws Exception {
		//SqlSession sqlSession = sqlSessionFactory.openSession();
		SqlSession sqlSession = this.getSqlSession();
		//执行插入操作
		sqlSession.delete("test.deleteUser", id);
		// 提交事务
		sqlSession.commit();
		// 释放资源
		//sqlSession.close();
	}

	@Override
	public List<User> queryUserByPage(UserPage userPage){
		SqlSession sqlSession = this.getSqlSession();
		List<User> list = sqlSession.selectList("test.queryUserByPage",userPage);
		return list;
	}




}
