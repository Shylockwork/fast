package webservice.rs.service;





import webservice.rs.entity.User;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.List;



/*
* @Path:访问当前服务接口的路径
* @Produces:服务器支持返回的数据格式类型
* */
@Path("/userService")
@Produces("*/*")
public interface IUserService {
	/*
	 * @Path:访问当前服务接口方法的路径
	 * @POST:表示请求的类型post对应insert操作
	 * @Consumes:服务器支持的请求的数据格式类型
	 * */
	@POST
	@Path("/user")
	@Consumes({ "application/xml", "application/json" })
	public void saveUser(User user);


	/*
	 * @Path:访问当前服务接口方法的路径
	 * @PUT:表示请求的类型post对应update操作
	 * */
	@PUT
	@Path("/user")
	@Consumes({ "application/xml", "application/json" })
	public void updateUser(User user);

	/*
	 * @Path:访问当前服务接口方法的路径
	 * @GET:表示请求的类型post对应select操作
	 * @Produces:服务器支持返回的数据格式类型
	 * */
	@GET
	@Path("/user")
	@Produces({ "application/xml", "application/json" })
	public List<User> findAllUsers();

	@GET
	@Path("/user/{id}")
	@Consumes("application/xml")
	@Produces({ "application/xml", "application/json" })
	public User finUserById(@PathParam("id") Integer id);

	@DELETE
	@Path("/user/{id}")
	@Consumes({"application/xml", "application/json"})
	public void deleteUser(@PathParam("id") Integer id);
}
