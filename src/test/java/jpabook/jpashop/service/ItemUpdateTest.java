package jpabook.jpashop.service;
import jpabook.jpashop.domain.item.Book;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import jakarta.persistence.EntityManager;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Transactional
public class ItemUpdateTest {

    @Autowired
    EntityManager em;

    @Test
    public void updateTest() {
        Book book = em.find(Book.class, 1L);

        // 영속 상태이므로, setter로 변경 시 자동 감지됨 (dirty checking)
        book.setName("asdfasdf");

        // 커밋 시점에 변경감지 발생
    }
}
