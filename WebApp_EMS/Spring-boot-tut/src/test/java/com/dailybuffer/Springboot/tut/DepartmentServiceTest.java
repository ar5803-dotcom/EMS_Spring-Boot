package com.dailybuffer.Springboot.tut.service;

import com.dailybuffer.Springboot.tut.entity.Department;
import com.dailybuffer.Springboot.tut.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DepartmentServiceTest {

    @Autowired
    private DepartmentService departmentService;

    @MockBean
    private DepartmentRepository departmentRepository;


    @BeforeEach
    void setUp() {
        Department department = Department.builder()
                .departmentName("AAYUSH")
                .departmentAddress("Ahmedabad")
                .departmentCode("AK-47")
                .departmentId(1)
                .build();
        Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("AAYUSH")).thenReturn(department);
    }


    @Test
    @DisplayName("Get data based on valid dept name")
    public void whenValidDepartmentName_thenDepartmentShouldFound() {
        String departmentName = "AAYUSH";
        Department found = departmentService.fetchDepartmentByName(departmentName);
        assertEquals(departmentName, found.getDepartmentName());
    }
}
