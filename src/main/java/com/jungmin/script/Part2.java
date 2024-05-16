package com.jungmin.script;

public class Part2 {
  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-1. users 테이블에 존재하는 모든 컬럼을 포함한 모든 데이터를 확인하기 위한 SQL을 작성해주세요.
  */
  public static final String PART2_1 = "SELECT * FROM users ";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-2. users 테이블에 존재하는 모든 데이터에서 username 컬럼만을 확인하기 위한 SQL을 작성해주세요.
  */
  public static final String PART2_2 = "SELECT username FROM users ";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-3. users 테이블에 데이터를 추가하기 위한 SQL을 작성해주세요.")
          - 원하는 username, email, password를 사용하시면 됩니다.
  */
  public static final String PART2_3 = "INSERT INTO users (username, email, password) VALUES ('김영진', 'kyj930610@gmail.com' , 'dyrskdhsp') ";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-4. users 테이블에서 특정 조건을 가진 데이터를 찾기위한 SQL을 작성해주세요.
          - 조건 : username이 luckykim이여야 합니다.
  */
  public static final String PART2_4 = "SELECT * FROM Users WHERE username = 'luckykim'";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-5. users 테이블에서 특정 조건을 가진 데이터를 찾기위한 SQL을 작성해주세요.
          - 조건 : username이 luckykim이 아니여야 합니다.
  */
  public static final String PART2_5 = "SELECT * FROM Users WHERE username <> 'luckykim'";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-6. posts 테이블에 존재하는 모든 데이터에서 title 컬럼만을 찾기 위한 SQL을 작성해주세요.
  */

  public static final String PART2_6 = "SELECT title from posts";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-7. posts의 title과 그 게시글을 작성한 user의 username을 찾기 위한 SQL을 작성해주세요.
          - 저자가 없더라도, posts의 title을 모두 찾아야합니다.
  */
  public static final String PART2_7 = "SELECT p.title, u.username FROM Posts as p LEFT JOIN Users as u ON u.user_id = p.user_id";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-8. posts의 title과 그 게시글을 작성한 user의 username을 찾기 위한 SQL을 작성해주세요.
          - 저자가 있는 posts의 title만 찾아야합니다.
  */
  public static final String PART2_8 = "SELECT p.title, u.username FROM Users as u JOIN Posts as p ON p.user_id = u.user_id";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-9. posts 테이블의 데이터를 수정하기 위한 SQL을 작성해주세요.
          - title이 'New Tech Trends'인 posts 데이터에서 content를 'Updated content'로 수정해야합니다.
  */
  public static final String PART2_9 = "UPDATE Posts Set content = 'Updated content' WHERE title = 'New Tech Trends'";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-10. posts 테이블의 데이터를 추가하기 위한 SQL을 작성해주세요.
          - luckykim이 작성한 게시글을 추가해주세요. 제목과 본문은 자유입니다. (참고: luckykim의 아이디는 1입니다.)
  */
  public static final String PART2_10 = "INSERT INTO Posts (user_id, title , content) VALUES (1,'화가 머리끝까지 남' , '그래서 하기싫음')";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-11. 어느 board에도 속하지 않는 post의 모든 데이터를 찾기위한 SQL을 작성해주세요.")
  */
  public static final String PART2_11 = "SELECT * FROM Posts WHERE board_id IS NULL";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-12. users 테이블의 user_id가 1인 유저가 작성한 post의 title을 찾기위한 SQL을 작성해주세요.
  */
  public static final String PART2_12 = "SELECT p.title FROM Users as u JOIN Posts as p ON p.user_id = u.user_id WHERE u.user_id = 1";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-13. users 테이블의 user_id가 1인 유저가 작성한 post의 board name을 찾기위한 SQL을 작성해주세요.
  */
  public static final String PART2_13 = "select b.name from posts as p \n" +
          "join users u on u.user_id = p.user_id \n" +
          "join boards b on b.board_id = p.board_id \n" +
          "where u.user_id = 1";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-14. board의 name이 'General Discussion'인 post의 title, content, created_at을 찾기위한 SQL을 작성해주세요.
  */
  public static final String PART2_14 = "select p.title, p.content, p.created_at from posts p \n" +
          "join boards b ON b.board_id = p.post_id\n" +
          "where b.name = 'General Discussion'";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-15. luckykim이 작성한 comment의 개수 (컬럼명: CommentCount)를 출력하기 위한 SQL을 작성해주세요.
  */
  public static final String PART2_15 = "select count(c.comment_id) as CommentCount from users u \n" +
          "join comments c on c.user_id = u.user_id \n" +
          "where u.username = 'luckykim';";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-16. 각 user(컬럼명: username)가 작성한 comment의 개수 (컬럼명: CommentCount)를 출력하기 위한 SQL을 작성해주세요.
          - 단, 0개의 comment를 작성한 유저도 모두 출력해야 합니다.
  */
  public static final String PART2_16 = "select u.username as username , count(c.comment_id) from comments c \n" +
          "left join users u on u.user_id = c.user_id group by u.user_id";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-17. 각 board의 name과 해당 board에 속한 post의 개수 (컬럼명: PostCount)를 출력하기 위한 SQL을 작성해주세요.
  */
  public static final String PART2_17 = "select b.name , count(p.board_id) from boards b \n" +
          "join posts p ON p.board_id = b.board_id group by b.name";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-18. 각 board의 name과 해당 board에 속한 posts 테이블의 content의 평균 길이 (컬럼명: AvgLength)를 출력하기 위한 SQL을 작성해주세요.")
  */
  public static final String PART2_18 = "select b.name , AVG(LENGTH(p.content)) as AvgLength from posts as p\n" +
          "\tleft join boards b on b.board_id = p.board_id \n" +
          "\tgroup by p.post_id";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-19. 각 board의 name과 해당 board에 속한 posts 테이블의 content의 평균 길이 (컬럼명: AvgLength)를 출력하기 위한 SQL을 작성해주세요.
          - 단, content가 null인 경우를 제외해야 합니다.
  */
  public static final String PART2_19 = "select b.name , AVG(LENGTH(p.content)) as AvgLength from posts as p\n" +
          "join boards b on b.board_id = p.board_id \n" +
          "group by b.name";

  /*
  ----------------------------------------------------------------------------------------------
      TODO: Q 2-20. 각 tag의 name과 해당 tag가 달린 post의 개수 (컬럼명: PostCount)를 출력하기 위한 SQL을 작성해주세요.
          - 단, post에 할당되지 않은 tag의 이름도 모두 출력해야 합니다.")
  */
  public static final String PART2_20 = "select t.name, count(pt.post_id) as PostCount from tags as t\n" +
          "left join post_tags pt on pt.tag_id = t.tag_id \n" +
          "left join posts p on p.post_id = pt.post_id group by t.name; \n";
}
