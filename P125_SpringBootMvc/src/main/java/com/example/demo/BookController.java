package com.example.demo;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/Book")
public class BookController {
@Autowired
JdbcTemplate jt;
BookService bookservice;

@RequestMapping("/reg")
public String addBook()
{
return "Reg";
}

@RequestMapping(value="/save",method=RequestMethod.POST)
public String addBookToDB(@ModelAttribute BookDemo book)
{

String sql="insert into Book values(?,?,?,?)";
jt.update(sql, book.getBookid(),book.getBookname(),book.getAuthor(),book.getPrice());
return "success";
}
@RequestMapping("/show")
public List<BookDemo> showData(final Model model)
{
return jt.query("select * from Book", new ResultSetExtractor<List<BookDemo>>()
{
public List<BookDemo> extractData(ResultSet rs)throws SQLException,DataAccessException
{
List<BookDemo> list=new ArrayList<BookDemo>();
while(rs.next())
{
BookDemo b=new BookDemo();
b.setBookid(rs.getString(1));
b.setBookname(rs.getString(2));
b.setAuthor(rs.getString(3));
b.setPrice(rs.getString(4));
list.add(b);
model.addAttribute("list",list);
}
System.out.println(list);
return list;
}
});
}

/*@RequestMapping("/show")
public String showData(Map<String,Object> map)
{
	//System.out.println(bookservice.getAll());
map.put("list", bookservice.getAll());
return "bookDetails";
}
*/


}