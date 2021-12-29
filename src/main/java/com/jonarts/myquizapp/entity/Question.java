package com.jonarts.myquizapp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;



@Table(name = "questions")
@Entity
@Getter
@Setter
public class Question {


		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="id")
		private int id;

		@Column(name="question")
		private String question;

		@Column(name="option_a")

		private String optionA;

		@Column(name="option_b")
		private String optionB;

		@Column(name="option_c")
		private String optionC;

		@Column(name="option_d")
		private String optionD;

		@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	    @JoinColumn(name = "answer_id")
		private Answer answer;




}
