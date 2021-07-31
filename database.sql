--
-- PostgreSQL database dump
--

-- Dumped from database version 13.3 (Ubuntu 13.3-1.pgdg20.04+1)
-- Dumped by pg_dump version 13.3 (Ubuntu 13.3-1.pgdg20.04+1)

-- Started on 2021-06-14 20:20:29 CST

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 221 (class 1259 OID 16595)
-- Name: class; Type: TABLE; Schema: public; Owner: susan
--

CREATE TABLE public.class (
    cl_id bigint NOT NULL,
    cl_name character varying(50) NOT NULL,
    dp_id smallint NOT NULL,
    create_time timestamp with time zone,
    update_time timestamp with time zone,
    delete_time timestamp with time zone
);


ALTER TABLE public.class OWNER TO susan;

--
-- TOC entry 220 (class 1259 OID 16593)
-- Name: class_cl_id_seq; Type: SEQUENCE; Schema: public; Owner: susan
--

CREATE SEQUENCE public.class_cl_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.class_cl_id_seq OWNER TO susan;

--
-- TOC entry 3144 (class 0 OID 0)
-- Dependencies: 220
-- Name: class_cl_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: susan
--

ALTER SEQUENCE public.class_cl_id_seq OWNED BY public.class.cl_id;


--
-- TOC entry 219 (class 1259 OID 16587)
-- Name: department; Type: TABLE; Schema: public; Owner: susan
--

CREATE TABLE public.department (
    dp_id integer NOT NULL,
    dp_name character varying(50) NOT NULL,
    update_time timestamp with time zone,
    delete_time timestamp with time zone,
    create_time timestamp with time zone
);


ALTER TABLE public.department OWNER TO susan;

--
-- TOC entry 218 (class 1259 OID 16585)
-- Name: department_dp_id_seq; Type: SEQUENCE; Schema: public; Owner: susan
--

CREATE SEQUENCE public.department_dp_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.department_dp_id_seq OWNER TO susan;

--
-- TOC entry 3145 (class 0 OID 0)
-- Dependencies: 218
-- Name: department_dp_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: susan
--

ALTER SEQUENCE public.department_dp_id_seq OWNED BY public.department.dp_id;


--
-- TOC entry 225 (class 1259 OID 16611)
-- Name: manager; Type: TABLE; Schema: public; Owner: susan
--

CREATE TABLE public.manager (
    m_id bigint NOT NULL,
    m_name character varying(20) NOT NULL,
    m_salt character varying(40) NOT NULL,
    m_pwd character varying(40) NOT NULL,
    m_email character varying(30) NOT NULL,
    create_time timestamp with time zone,
    update_time timestamp with time zone,
    delete_time timestamp with time zone,
    dp_id integer NOT NULL
);


ALTER TABLE public.manager OWNER TO susan;

--
-- TOC entry 224 (class 1259 OID 16609)
-- Name: dp_manager_dm_id_seq; Type: SEQUENCE; Schema: public; Owner: susan
--

CREATE SEQUENCE public.dp_manager_dm_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.dp_manager_dm_id_seq OWNER TO susan;

--
-- TOC entry 3146 (class 0 OID 0)
-- Dependencies: 224
-- Name: dp_manager_dm_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: susan
--

ALTER SEQUENCE public.dp_manager_dm_id_seq OWNED BY public.manager.m_id;


--
-- TOC entry 217 (class 1259 OID 16562)
-- Name: lesson; Type: TABLE; Schema: public; Owner: susan
--

CREATE TABLE public.lesson (
    ls_id bigint NOT NULL,
    ls_name character varying(10) NOT NULL,
    ls_credit real NOT NULL,
    ls_time character varying(20) NOT NULL,
    update_time timestamp with time zone,
    create_time timestamp with time zone,
    delete_time timestamp with time zone,
    dp_id integer NOT NULL
);


ALTER TABLE public.lesson OWNER TO susan;

--
-- TOC entry 216 (class 1259 OID 16560)
-- Name: lesson_ls_id_seq; Type: SEQUENCE; Schema: public; Owner: susan
--

CREATE SEQUENCE public.lesson_ls_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.lesson_ls_id_seq OWNER TO susan;

--
-- TOC entry 3147 (class 0 OID 0)
-- Dependencies: 216
-- Name: lesson_ls_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: susan
--

ALTER SEQUENCE public.lesson_ls_id_seq OWNED BY public.lesson.ls_id;


--
-- TOC entry 207 (class 1259 OID 16518)
-- Name: lg_result; Type: TABLE; Schema: public; Owner: susan
--

CREATE TABLE public.lg_result (
    lgr_id bigint NOT NULL,
    lgr_result real NOT NULL,
    st_id bigint NOT NULL,
    lg_id bigint NOT NULL,
    create_time timestamp with time zone,
    update_time timestamp with time zone
);


ALTER TABLE public.lg_result OWNER TO susan;

--
-- TOC entry 206 (class 1259 OID 16516)
-- Name: lg_result_lgr_id_seq; Type: SEQUENCE; Schema: public; Owner: susan
--

CREATE SEQUENCE public.lg_result_lgr_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.lg_result_lgr_id_seq OWNER TO susan;

--
-- TOC entry 3148 (class 0 OID 0)
-- Dependencies: 206
-- Name: lg_result_lgr_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: susan
--

ALTER SEQUENCE public.lg_result_lgr_id_seq OWNED BY public.lg_result.lgr_id;


--
-- TOC entry 205 (class 1259 OID 16507)
-- Name: ls_goal; Type: TABLE; Schema: public; Owner: susan
--

CREATE TABLE public.ls_goal (
    lg_id bigint NOT NULL,
    lg_description text NOT NULL,
    lg_proportion real NOT NULL,
    ls_id bigint NOT NULL,
    lg_name character varying(10) NOT NULL,
    update_time timestamp with time zone
);


ALTER TABLE public.ls_goal OWNER TO susan;

--
-- TOC entry 204 (class 1259 OID 16505)
-- Name: ls_goal_lg_id_seq; Type: SEQUENCE; Schema: public; Owner: susan
--

CREATE SEQUENCE public.ls_goal_lg_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.ls_goal_lg_id_seq OWNER TO susan;

--
-- TOC entry 3149 (class 0 OID 0)
-- Dependencies: 204
-- Name: ls_goal_lg_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: susan
--

ALTER SEQUENCE public.ls_goal_lg_id_seq OWNED BY public.ls_goal.lg_id;


--
-- TOC entry 201 (class 1259 OID 16491)
-- Name: ls_relation; Type: TABLE; Schema: public; Owner: susan
--

CREATE TABLE public.ls_relation (
    lr_id bigint NOT NULL,
    ls_id bigint NOT NULL,
    tc_id bigint NOT NULL,
    cl_id integer NOT NULL,
    update_time timestamp with time zone,
    delete_time timestamp with time zone
);


ALTER TABLE public.ls_relation OWNER TO susan;

--
-- TOC entry 200 (class 1259 OID 16489)
-- Name: ls_relation_lr_id_seq; Type: SEQUENCE; Schema: public; Owner: susan
--

CREATE SEQUENCE public.ls_relation_lr_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.ls_relation_lr_id_seq OWNER TO susan;

--
-- TOC entry 3150 (class 0 OID 0)
-- Dependencies: 200
-- Name: ls_relation_lr_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: susan
--

ALTER SEQUENCE public.ls_relation_lr_id_seq OWNED BY public.ls_relation.lr_id;


--
-- TOC entry 203 (class 1259 OID 16499)
-- Name: ls_result; Type: TABLE; Schema: public; Owner: susan
--

CREATE TABLE public.ls_result (
    lsr_id bigint NOT NULL,
    st_id bigint NOT NULL,
    ls_id bigint NOT NULL,
    lsr_result real NOT NULL,
    create_time timestamp with time zone,
    update_time timestamp with time zone
);


ALTER TABLE public.ls_result OWNER TO susan;

--
-- TOC entry 202 (class 1259 OID 16497)
-- Name: ls_result_lsr_id_seq; Type: SEQUENCE; Schema: public; Owner: susan
--

CREATE SEQUENCE public.ls_result_lsr_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.ls_result_lsr_id_seq OWNER TO susan;

--
-- TOC entry 3151 (class 0 OID 0)
-- Dependencies: 202
-- Name: ls_result_lsr_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: susan
--

ALTER SEQUENCE public.ls_result_lsr_id_seq OWNED BY public.ls_result.lsr_id;


--
-- TOC entry 223 (class 1259 OID 16603)
-- Name: student; Type: TABLE; Schema: public; Owner: susan
--

CREATE TABLE public.student (
    st_id bigint NOT NULL,
    st_name character varying(50) NOT NULL,
    st_gender character(2),
    st_salt character varying(40) NOT NULL,
    st_pwd character varying(40) NOT NULL,
    st_email character varying(30) NOT NULL,
    cl_id bigint NOT NULL,
    update_time timestamp with time zone,
    create_time timestamp with time zone,
    delete_time timestamp with time zone
);


ALTER TABLE public.student OWNER TO susan;

--
-- TOC entry 222 (class 1259 OID 16601)
-- Name: student_st_id_seq; Type: SEQUENCE; Schema: public; Owner: susan
--

CREATE SEQUENCE public.student_st_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.student_st_id_seq OWNER TO susan;

--
-- TOC entry 3152 (class 0 OID 0)
-- Dependencies: 222
-- Name: student_st_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: susan
--

ALTER SEQUENCE public.student_st_id_seq OWNED BY public.student.st_id;


--
-- TOC entry 227 (class 1259 OID 16631)
-- Name: teacher; Type: TABLE; Schema: public; Owner: susan
--

CREATE TABLE public.teacher (
    tc_id bigint NOT NULL,
    tc_name character varying(10) NOT NULL,
    tc_title character varying(10) NOT NULL,
    tc_salt character varying(40) NOT NULL,
    tc_pwd character varying(40) NOT NULL,
    tc_email character varying(30) NOT NULL,
    dp_id integer NOT NULL,
    create_time timestamp with time zone,
    update_time timestamp with time zone,
    delete_time timestamp with time zone
);


ALTER TABLE public.teacher OWNER TO susan;

--
-- TOC entry 226 (class 1259 OID 16629)
-- Name: teacher_tc_id_seq; Type: SEQUENCE; Schema: public; Owner: susan
--

CREATE SEQUENCE public.teacher_tc_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.teacher_tc_id_seq OWNER TO susan;

--
-- TOC entry 3153 (class 0 OID 0)
-- Dependencies: 226
-- Name: teacher_tc_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: susan
--

ALTER SEQUENCE public.teacher_tc_id_seq OWNED BY public.teacher.tc_id;


--
-- TOC entry 213 (class 1259 OID 16540)
-- Name: test; Type: TABLE; Schema: public; Owner: susan
--

CREATE TABLE public.test (
    t_id bigint NOT NULL,
    t_name character varying(10) NOT NULL,
    total_score real NOT NULL,
    tt_id bigint NOT NULL,
    update_time timestamp with time zone
);


ALTER TABLE public.test OWNER TO susan;

--
-- TOC entry 212 (class 1259 OID 16538)
-- Name: test_t_id_seq; Type: SEQUENCE; Schema: public; Owner: susan
--

CREATE SEQUENCE public.test_t_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.test_t_id_seq OWNER TO susan;

--
-- TOC entry 3154 (class 0 OID 0)
-- Dependencies: 212
-- Name: test_t_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: susan
--

ALTER SEQUENCE public.test_t_id_seq OWNED BY public.test.t_id;


--
-- TOC entry 209 (class 1259 OID 16526)
-- Name: test_type; Type: TABLE; Schema: public; Owner: susan
--

CREATE TABLE public.test_type (
    tt_id bigint NOT NULL,
    tt_name character varying(10) NOT NULL,
    tt_proportion real NOT NULL,
    lg_id bigint NOT NULL,
    update_time timestamp with time zone
);


ALTER TABLE public.test_type OWNER TO susan;

--
-- TOC entry 208 (class 1259 OID 16524)
-- Name: test_type_tt_id_seq; Type: SEQUENCE; Schema: public; Owner: susan
--

CREATE SEQUENCE public.test_type_tt_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.test_type_tt_id_seq OWNER TO susan;

--
-- TOC entry 3155 (class 0 OID 0)
-- Dependencies: 208
-- Name: test_type_tt_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: susan
--

ALTER SEQUENCE public.test_type_tt_id_seq OWNED BY public.test_type.tt_id;


--
-- TOC entry 215 (class 1259 OID 16546)
-- Name: ts_result; Type: TABLE; Schema: public; Owner: susan
--

CREATE TABLE public.ts_result (
    tsr_id bigint NOT NULL,
    tsr_result real NOT NULL,
    t_id bigint NOT NULL,
    st_id bigint NOT NULL,
    update_time timestamp with time zone
);


ALTER TABLE public.ts_result OWNER TO susan;

--
-- TOC entry 214 (class 1259 OID 16544)
-- Name: ts_result_tsr_id_seq; Type: SEQUENCE; Schema: public; Owner: susan
--

CREATE SEQUENCE public.ts_result_tsr_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.ts_result_tsr_id_seq OWNER TO susan;

--
-- TOC entry 3156 (class 0 OID 0)
-- Dependencies: 214
-- Name: ts_result_tsr_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: susan
--

ALTER SEQUENCE public.ts_result_tsr_id_seq OWNED BY public.ts_result.tsr_id;


--
-- TOC entry 211 (class 1259 OID 16532)
-- Name: tt_result; Type: TABLE; Schema: public; Owner: susan
--

CREATE TABLE public.tt_result (
    ttr_id bigint NOT NULL,
    ttr_result real NOT NULL,
    tt_id bigint NOT NULL,
    st_id bigint NOT NULL,
    update_time timestamp with time zone
);


ALTER TABLE public.tt_result OWNER TO susan;

--
-- TOC entry 210 (class 1259 OID 16530)
-- Name: tt_result_ttr_id_seq; Type: SEQUENCE; Schema: public; Owner: susan
--

CREATE SEQUENCE public.tt_result_ttr_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.tt_result_ttr_id_seq OWNER TO susan;

--
-- TOC entry 3157 (class 0 OID 0)
-- Dependencies: 210
-- Name: tt_result_ttr_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: susan
--

ALTER SEQUENCE public.tt_result_ttr_id_seq OWNED BY public.tt_result.ttr_id;


--
-- TOC entry 2949 (class 2604 OID 16598)
-- Name: class cl_id; Type: DEFAULT; Schema: public; Owner: susan
--

ALTER TABLE ONLY public.class ALTER COLUMN cl_id SET DEFAULT nextval('public.class_cl_id_seq'::regclass);


--
-- TOC entry 2948 (class 2604 OID 16590)
-- Name: department dp_id; Type: DEFAULT; Schema: public; Owner: susan
--

ALTER TABLE ONLY public.department ALTER COLUMN dp_id SET DEFAULT nextval('public.department_dp_id_seq'::regclass);


--
-- TOC entry 2947 (class 2604 OID 16565)
-- Name: lesson ls_id; Type: DEFAULT; Schema: public; Owner: susan
--

ALTER TABLE ONLY public.lesson ALTER COLUMN ls_id SET DEFAULT nextval('public.lesson_ls_id_seq'::regclass);


--
-- TOC entry 2942 (class 2604 OID 16521)
-- Name: lg_result lgr_id; Type: DEFAULT; Schema: public; Owner: susan
--

ALTER TABLE ONLY public.lg_result ALTER COLUMN lgr_id SET DEFAULT nextval('public.lg_result_lgr_id_seq'::regclass);


--
-- TOC entry 2941 (class 2604 OID 16510)
-- Name: ls_goal lg_id; Type: DEFAULT; Schema: public; Owner: susan
--

ALTER TABLE ONLY public.ls_goal ALTER COLUMN lg_id SET DEFAULT nextval('public.ls_goal_lg_id_seq'::regclass);


--
-- TOC entry 2939 (class 2604 OID 16494)
-- Name: ls_relation lr_id; Type: DEFAULT; Schema: public; Owner: susan
--

ALTER TABLE ONLY public.ls_relation ALTER COLUMN lr_id SET DEFAULT nextval('public.ls_relation_lr_id_seq'::regclass);


--
-- TOC entry 2940 (class 2604 OID 16502)
-- Name: ls_result lsr_id; Type: DEFAULT; Schema: public; Owner: susan
--

ALTER TABLE ONLY public.ls_result ALTER COLUMN lsr_id SET DEFAULT nextval('public.ls_result_lsr_id_seq'::regclass);


--
-- TOC entry 2951 (class 2604 OID 16614)
-- Name: manager m_id; Type: DEFAULT; Schema: public; Owner: susan
--

ALTER TABLE ONLY public.manager ALTER COLUMN m_id SET DEFAULT nextval('public.dp_manager_dm_id_seq'::regclass);


--
-- TOC entry 2950 (class 2604 OID 16606)
-- Name: student st_id; Type: DEFAULT; Schema: public; Owner: susan
--

ALTER TABLE ONLY public.student ALTER COLUMN st_id SET DEFAULT nextval('public.student_st_id_seq'::regclass);


--
-- TOC entry 2952 (class 2604 OID 16634)
-- Name: teacher tc_id; Type: DEFAULT; Schema: public; Owner: susan
--

ALTER TABLE ONLY public.teacher ALTER COLUMN tc_id SET DEFAULT nextval('public.teacher_tc_id_seq'::regclass);


--
-- TOC entry 2945 (class 2604 OID 16543)
-- Name: test t_id; Type: DEFAULT; Schema: public; Owner: susan
--

ALTER TABLE ONLY public.test ALTER COLUMN t_id SET DEFAULT nextval('public.test_t_id_seq'::regclass);


--
-- TOC entry 2943 (class 2604 OID 16529)
-- Name: test_type tt_id; Type: DEFAULT; Schema: public; Owner: susan
--

ALTER TABLE ONLY public.test_type ALTER COLUMN tt_id SET DEFAULT nextval('public.test_type_tt_id_seq'::regclass);


--
-- TOC entry 2946 (class 2604 OID 16549)
-- Name: ts_result tsr_id; Type: DEFAULT; Schema: public; Owner: susan
--

ALTER TABLE ONLY public.ts_result ALTER COLUMN tsr_id SET DEFAULT nextval('public.ts_result_tsr_id_seq'::regclass);


--
-- TOC entry 2944 (class 2604 OID 16535)
-- Name: tt_result ttr_id; Type: DEFAULT; Schema: public; Owner: susan
--

ALTER TABLE ONLY public.tt_result ALTER COLUMN ttr_id SET DEFAULT nextval('public.tt_result_ttr_id_seq'::regclass);


--
-- TOC entry 3132 (class 0 OID 16595)
-- Dependencies: 221
-- Data for Name: class; Type: TABLE DATA; Schema: public; Owner: susan
--

COPY public.class (cl_id, cl_name, dp_id, create_time, update_time, delete_time) FROM stdin;
4	计算机8701班	1	\N	\N	\N
5	计算机8702班	1	\N	\N	\N
7	计算机9801	1	2021-05-04 13:31:22.78784+08	\N	2021-05-04 13:32:20.114928+08
6	计算机8704班	1	\N	2021-05-04 13:38:07.18874+08	\N
8	室内设计8901	2	2021-06-04 01:31:36.609542+08	\N	2021-06-04 01:31:48.084837+08
\.


--
-- TOC entry 3130 (class 0 OID 16587)
-- Dependencies: 219
-- Data for Name: department; Type: TABLE DATA; Schema: public; Owner: susan
--

COPY public.department (dp_id, dp_name, update_time, delete_time, create_time) FROM stdin;
1	计算机学院	\N	\N	\N
2	包装设计学院	\N	\N	\N
3	冶金学院	\N	\N	\N
4	土木工程学院	\N	\N	\N
5	理学院	\N	\N	\N
6	外语学院	\N	\N	\N
7	商学院	\N	\N	\N
8	法学院	\N	\N	\N
11	电气学院	\N	\N	\N
12	交通学院	\N	\N	\N
10	国际关系学院	\N	2021-04-28 21:50:13.514919+08	\N
9	国际贸易学院	\N	2021-04-28 21:52:04.899391+08	\N
13	天天学院	\N	2021-06-04 01:30:28.618609+08	2021-05-01 16:43:37.238006+08
14	天天学院	\N	\N	2021-06-04 01:30:43.390883+08
\.


--
-- TOC entry 3128 (class 0 OID 16562)
-- Dependencies: 217
-- Data for Name: lesson; Type: TABLE DATA; Schema: public; Owner: susan
--

COPY public.lesson (ls_id, ls_name, ls_credit, ls_time, update_time, create_time, delete_time, dp_id) FROM stdin;
11	编译原理	3	2020-2	2021-05-09 14:33:35.529313+08	\N	\N	1
14	编译原理	3	2020-2	2021-05-09 14:33:35.529313+08	\N	2021-05-05 01:49:21.407213+08	1
9	编译原理	3	2020-2	2021-05-09 14:33:35.529313+08	\N	2021-05-05 01:49:26.952657+08	1
17	编译原理	3	2020-2	2021-05-09 14:33:35.529313+08	2021-05-09 13:58:06.349223+08	2021-05-09 13:58:15.693091+08	4
6	大学物理	3	2020-2	2021-05-09 14:35:55.475876+08	\N	\N	1
16	大学英语	3	2020-2	2021-05-09 14:36:06.569369+08	2021-05-09 13:57:30.321204+08	\N	1
5	高等数学	3	2020-2	2021-05-09 14:36:24.157777+08	\N	\N	1
13	线性代数	3	2020-2	2021-05-09 14:36:35.406961+08	\N	\N	1
12	概率论与数理统计	3	2020-2	2021-05-09 14:36:57.604529+08	\N	\N	1
15	生物学基础	3	2020-1	2021-05-09 14:37:20.698192+08	2021-05-05 00:50:42.649205+08	\N	1
10	计算机基础	3	2020-2	2021-05-09 14:37:49.572653+08	\N	\N	1
7	计算机网络	3	2020-2	2021-05-09 14:38:27.031447+08	\N	\N	1
8	Java web	3	2020-2	2021-05-09 14:38:54.925194+08	\N	\N	1
18	C语言	3	2021-01	\N	2021-05-30 16:08:06.239806+08	\N	1
\.


--
-- TOC entry 3118 (class 0 OID 16518)
-- Dependencies: 207
-- Data for Name: lg_result; Type: TABLE DATA; Schema: public; Owner: susan
--

COPY public.lg_result (lgr_id, lgr_result, st_id, lg_id, create_time, update_time) FROM stdin;
\.


--
-- TOC entry 3116 (class 0 OID 16507)
-- Dependencies: 205
-- Data for Name: ls_goal; Type: TABLE DATA; Schema: public; Owner: susan
--

COPY public.ls_goal (lg_id, lg_description, lg_proportion, ls_id, lg_name, update_time) FROM stdin;
3	了解编译原理基础部分	0.4	11	目标二	\N
2	掌握高级编译原理部分	0.7	11	目标一	2021-05-17 00:33:11.458617+08
\.


--
-- TOC entry 3112 (class 0 OID 16491)
-- Dependencies: 201
-- Data for Name: ls_relation; Type: TABLE DATA; Schema: public; Owner: susan
--

COPY public.ls_relation (lr_id, ls_id, tc_id, cl_id, update_time, delete_time) FROM stdin;
1	11	2	4	\N	2021-05-23 22:42:38.767729+08
2	11	2	4	\N	\N
3	6	2	5	\N	\N
4	5	2	6	\N	\N
5	11	2	6	\N	\N
\.


--
-- TOC entry 3114 (class 0 OID 16499)
-- Dependencies: 203
-- Data for Name: ls_result; Type: TABLE DATA; Schema: public; Owner: susan
--

COPY public.ls_result (lsr_id, st_id, ls_id, lsr_result, create_time, update_time) FROM stdin;
\.


--
-- TOC entry 3136 (class 0 OID 16611)
-- Dependencies: 225
-- Data for Name: manager; Type: TABLE DATA; Schema: public; Owner: susan
--

COPY public.manager (m_id, m_name, m_salt, m_pwd, m_email, create_time, update_time, delete_time, dp_id) FROM stdin;
2	sunjun	asdfasdf	sdfasdfasdfasdf	sunjon@gmail.com	\N	\N	\N	1
3	sdfasdfa	sdfadsfas	sdfasdfa	sunjon898@qq.com	\N	2021-05-03 13:33:22.126173+08	\N	1
4	jklhghjfgh	sdfasdfa	ewrserwr	sunjojn@qq.com	\N	2021-05-03 13:33:59.058767+08	\N	1
5	asdfadf	asdfasdfa	W2ERSDFZXCV	1111@qq.com	\N	2021-05-03 13:35:32.494788+08	\N	1
6	asdfasdf	dsfasdfad	VASDFAsdf	sunjon@qq.com	\N	2021-05-03 13:38:04.383622+08	\N	1
7	adsfadfd	asdfasdfa	vzsdvqaewf	sdufndfa@qq.com	\N	2021-05-03 13:38:51.359174+08	\N	1
8	sdffvxvsa	asdfasdf	fasdfvfaseaf	wergasdfASDFSWAF	\N	\N	\N	1
9	asdfxczvsdv	asdf	vzxcvwarfgs	EWERASSDFQAF	\N	\N	\N	1
10	adsfadsfasd	asdfadsfasdf	sdfxcvaesfqew	WERASDF	\N	\N	\N	1
11	cxvzdfawf	asdfasdfas	sdfadsxcvawerf	WERAFD	\N	\N	\N	1
12	werfsdfzddf	asdfadf	asdfasdfasddfa	SDFASDF	\N	\N	\N	1
13	asdfxcvhger	adsfadfa	asdfasdfasdf	DSFADSFA	\N	\N	\N	1
14	孙俊	|G<cx84!^"Nnpu<n	23gdl998hi4fkj1mhson93uflnhrstmo	234124@qq.com	\N	\N	\N	1
15	何婷	VMhS5KBjfnP%'"Iu	esoqveo2rks6i3pjdpr6as6o5j8fifnh	1234141@qq.com	2021-05-03 13:28:43.189949+08	\N	2021-05-03 13:48:26.230563+08	1
16	花花	`49GY!vDTft|8E#.	dj4c5l2bsf7d7hh6j1ha992ft5h55d2c	dfa@qew.com	2021-05-03 22:34:25.536295+08	\N	\N	1
17	孙俊	Sm.8AI2\\)d[gbVQ"	-9tnc86sfb4v761pg84opa4l0gj1ngmk2	2418778713@qq.com	2021-05-05 23:17:06.891292+08	\N	\N	1
18	heting	C}9A&!A\\H_fmPk1c	-d6up1960ql0fi0mq0k7lknfgq7kd065r	sun@test.com	2021-05-09 16:34:40.400984+08	\N	\N	1
\.


--
-- TOC entry 3134 (class 0 OID 16603)
-- Dependencies: 223
-- Data for Name: student; Type: TABLE DATA; Schema: public; Owner: susan
--

COPY public.student (st_id, st_name, st_gender, st_salt, st_pwd, st_email, cl_id, update_time, create_time, delete_time) FROM stdin;
2	susan	女 	p8%\\Ucd"awb$hMKe	8jvdo9qk97ubdfsh60906hvb369d2275	sunjon529@gmail.com	4	2021-04-27 20:58:58.942882+08	\N	\N
3	atlas	男 	Wtp<Ov11E8k!Jy%P	br3mc0l3rcgn5vs2cevbrgcagc85e0k4	sunjon529@gmail.com	5	2021-04-27 21:00:18.345259+08	\N	\N
4	golang	男 	$t/_nd9#/Bx<Nx%A	-eq6odnjds0falg79fe3sj5fflen44p3v	sunjon529@gmail.com	6	2021-04-27 21:00:55.540045+08	\N	\N
5	小哈u	男 	\\b;KY"47{o;`xjm|	6g2npi2g9elegnm20ugl9r7c15vaq361	sunjonadf@qq.com	6	\N	2021-05-09 11:11:16.2886+08	\N
6	小花	女 	W]hVn32WD4+sU0<r	b65hl2ogdhd01is4ihe7q9qca714ues2	dafdad@qq.com	6	\N	2021-05-09 11:14:58.729587+08	\N
1	sunjon	女 	g0w)+J$J}/]GNv*h	-bp2mfv9qs9m1d1urt995pq32pa9k0c8p	sunjon529@123.com	4	2021-05-09 11:31:04.768485+08	\N	2021-05-09 11:31:12.352936+08
7	sunjon	男 	l@iz{iyaR<C[d[$!	-87l39tese7h8lgcvf1uvvin12g0afe8l	sdfa@qq.com	4	\N	2021-05-29 20:07:38.046949+08	\N
8	lgajdgjaadf	男 	$k4a$EBag}f0acFr	e0v8f2732aj4ddddl61t0tvg3lmv35gg	dsfa@dfa.com	4	\N	2021-05-29 20:08:01.051966+08	\N
\.


--
-- TOC entry 3138 (class 0 OID 16631)
-- Dependencies: 227
-- Data for Name: teacher; Type: TABLE DATA; Schema: public; Owner: susan
--

COPY public.teacher (tc_id, tc_name, tc_title, tc_salt, tc_pwd, tc_email, dp_id, create_time, update_time, delete_time) FROM stdin;
1	花花	教授	qB91IbvU/fp+DRy&	-e2gso8lpo44l5u9rem5to6qv6j9fl36i	dfsuns@gmail.com	1	2021-05-03 22:43:18.070878+08	2021-05-03 22:46:59.269055+08	2021-05-03 22:47:03.159946+08
2	小花	教授	\\Vf(x^bDDF2t-VU!	e341p7brdadk4mr3vnm9v474mnl4i4nj	suhua@qq.com	2	2021-05-03 22:47:31.090265+08	2021-05-06 22:11:36.706045+08	\N
3	sunjon	讲师	\\Fs(/RAB^W=sqH"e	-8slrb08fpga0dg11bu5fqu4e1m8aek68	test@sj.com	1	2021-05-24 02:38:03.698769+08	\N	\N
\.


--
-- TOC entry 3124 (class 0 OID 16540)
-- Dependencies: 213
-- Data for Name: test; Type: TABLE DATA; Schema: public; Owner: susan
--

COPY public.test (t_id, t_name, total_score, tt_id, update_time) FROM stdin;
\.


--
-- TOC entry 3120 (class 0 OID 16526)
-- Dependencies: 209
-- Data for Name: test_type; Type: TABLE DATA; Schema: public; Owner: susan
--

COPY public.test_type (tt_id, tt_name, tt_proportion, lg_id, update_time) FROM stdin;
3	测试类	0.3	3	\N
2	测试基础类	0.5	3	2021-05-20 02:19:54.00292+08
\.


--
-- TOC entry 3126 (class 0 OID 16546)
-- Dependencies: 215
-- Data for Name: ts_result; Type: TABLE DATA; Schema: public; Owner: susan
--

COPY public.ts_result (tsr_id, tsr_result, t_id, st_id, update_time) FROM stdin;
\.


--
-- TOC entry 3122 (class 0 OID 16532)
-- Dependencies: 211
-- Data for Name: tt_result; Type: TABLE DATA; Schema: public; Owner: susan
--

COPY public.tt_result (ttr_id, ttr_result, tt_id, st_id, update_time) FROM stdin;
\.


--
-- TOC entry 3158 (class 0 OID 0)
-- Dependencies: 220
-- Name: class_cl_id_seq; Type: SEQUENCE SET; Schema: public; Owner: susan
--

SELECT pg_catalog.setval('public.class_cl_id_seq', 8, true);


--
-- TOC entry 3159 (class 0 OID 0)
-- Dependencies: 218
-- Name: department_dp_id_seq; Type: SEQUENCE SET; Schema: public; Owner: susan
--

SELECT pg_catalog.setval('public.department_dp_id_seq', 14, true);


--
-- TOC entry 3160 (class 0 OID 0)
-- Dependencies: 224
-- Name: dp_manager_dm_id_seq; Type: SEQUENCE SET; Schema: public; Owner: susan
--

SELECT pg_catalog.setval('public.dp_manager_dm_id_seq', 18, true);


--
-- TOC entry 3161 (class 0 OID 0)
-- Dependencies: 216
-- Name: lesson_ls_id_seq; Type: SEQUENCE SET; Schema: public; Owner: susan
--

SELECT pg_catalog.setval('public.lesson_ls_id_seq', 18, true);


--
-- TOC entry 3162 (class 0 OID 0)
-- Dependencies: 206
-- Name: lg_result_lgr_id_seq; Type: SEQUENCE SET; Schema: public; Owner: susan
--

SELECT pg_catalog.setval('public.lg_result_lgr_id_seq', 1, false);


--
-- TOC entry 3163 (class 0 OID 0)
-- Dependencies: 204
-- Name: ls_goal_lg_id_seq; Type: SEQUENCE SET; Schema: public; Owner: susan
--

SELECT pg_catalog.setval('public.ls_goal_lg_id_seq', 3, true);


--
-- TOC entry 3164 (class 0 OID 0)
-- Dependencies: 200
-- Name: ls_relation_lr_id_seq; Type: SEQUENCE SET; Schema: public; Owner: susan
--

SELECT pg_catalog.setval('public.ls_relation_lr_id_seq', 5, true);


--
-- TOC entry 3165 (class 0 OID 0)
-- Dependencies: 202
-- Name: ls_result_lsr_id_seq; Type: SEQUENCE SET; Schema: public; Owner: susan
--

SELECT pg_catalog.setval('public.ls_result_lsr_id_seq', 1, false);


--
-- TOC entry 3166 (class 0 OID 0)
-- Dependencies: 222
-- Name: student_st_id_seq; Type: SEQUENCE SET; Schema: public; Owner: susan
--

SELECT pg_catalog.setval('public.student_st_id_seq', 8, true);


--
-- TOC entry 3167 (class 0 OID 0)
-- Dependencies: 226
-- Name: teacher_tc_id_seq; Type: SEQUENCE SET; Schema: public; Owner: susan
--

SELECT pg_catalog.setval('public.teacher_tc_id_seq', 3, true);


--
-- TOC entry 3168 (class 0 OID 0)
-- Dependencies: 212
-- Name: test_t_id_seq; Type: SEQUENCE SET; Schema: public; Owner: susan
--

SELECT pg_catalog.setval('public.test_t_id_seq', 1, false);


--
-- TOC entry 3169 (class 0 OID 0)
-- Dependencies: 208
-- Name: test_type_tt_id_seq; Type: SEQUENCE SET; Schema: public; Owner: susan
--

SELECT pg_catalog.setval('public.test_type_tt_id_seq', 3, true);


--
-- TOC entry 3170 (class 0 OID 0)
-- Dependencies: 214
-- Name: ts_result_tsr_id_seq; Type: SEQUENCE SET; Schema: public; Owner: susan
--

SELECT pg_catalog.setval('public.ts_result_tsr_id_seq', 1, false);


--
-- TOC entry 3171 (class 0 OID 0)
-- Dependencies: 210
-- Name: tt_result_ttr_id_seq; Type: SEQUENCE SET; Schema: public; Owner: susan
--

SELECT pg_catalog.setval('public.tt_result_ttr_id_seq', 1, false);


--
-- TOC entry 2974 (class 2606 OID 16600)
-- Name: class class_pkey; Type: CONSTRAINT; Schema: public; Owner: susan
--

ALTER TABLE ONLY public.class
    ADD CONSTRAINT class_pkey PRIMARY KEY (cl_id);


--
-- TOC entry 2972 (class 2606 OID 16592)
-- Name: department department_pkey; Type: CONSTRAINT; Schema: public; Owner: susan
--

ALTER TABLE ONLY public.department
    ADD CONSTRAINT department_pkey PRIMARY KEY (dp_id);


--
-- TOC entry 2978 (class 2606 OID 16616)
-- Name: manager dp_manager_pkey; Type: CONSTRAINT; Schema: public; Owner: susan
--

ALTER TABLE ONLY public.manager
    ADD CONSTRAINT dp_manager_pkey PRIMARY KEY (m_id);


--
-- TOC entry 2970 (class 2606 OID 16567)
-- Name: lesson lesson_pkey; Type: CONSTRAINT; Schema: public; Owner: susan
--

ALTER TABLE ONLY public.lesson
    ADD CONSTRAINT lesson_pkey PRIMARY KEY (ls_id);


--
-- TOC entry 2960 (class 2606 OID 16523)
-- Name: lg_result lg_result_pkey; Type: CONSTRAINT; Schema: public; Owner: susan
--

ALTER TABLE ONLY public.lg_result
    ADD CONSTRAINT lg_result_pkey PRIMARY KEY (lgr_id);


--
-- TOC entry 2958 (class 2606 OID 16515)
-- Name: ls_goal ls_goal_pkey; Type: CONSTRAINT; Schema: public; Owner: susan
--

ALTER TABLE ONLY public.ls_goal
    ADD CONSTRAINT ls_goal_pkey PRIMARY KEY (lg_id);


--
-- TOC entry 2954 (class 2606 OID 16496)
-- Name: ls_relation ls_relation_pkey; Type: CONSTRAINT; Schema: public; Owner: susan
--

ALTER TABLE ONLY public.ls_relation
    ADD CONSTRAINT ls_relation_pkey PRIMARY KEY (lr_id);


--
-- TOC entry 2956 (class 2606 OID 16504)
-- Name: ls_result ls_result_pkey; Type: CONSTRAINT; Schema: public; Owner: susan
--

ALTER TABLE ONLY public.ls_result
    ADD CONSTRAINT ls_result_pkey PRIMARY KEY (lsr_id);


--
-- TOC entry 2976 (class 2606 OID 16608)
-- Name: student student_pkey; Type: CONSTRAINT; Schema: public; Owner: susan
--

ALTER TABLE ONLY public.student
    ADD CONSTRAINT student_pkey PRIMARY KEY (st_id);


--
-- TOC entry 2980 (class 2606 OID 16636)
-- Name: teacher teacher_pkey; Type: CONSTRAINT; Schema: public; Owner: susan
--

ALTER TABLE ONLY public.teacher
    ADD CONSTRAINT teacher_pkey PRIMARY KEY (tc_id);


--
-- TOC entry 2966 (class 2606 OID 16553)
-- Name: test test_pkey; Type: CONSTRAINT; Schema: public; Owner: susan
--

ALTER TABLE ONLY public.test
    ADD CONSTRAINT test_pkey PRIMARY KEY (t_id);


--
-- TOC entry 2962 (class 2606 OID 16555)
-- Name: test_type test_type_pkey; Type: CONSTRAINT; Schema: public; Owner: susan
--

ALTER TABLE ONLY public.test_type
    ADD CONSTRAINT test_type_pkey PRIMARY KEY (tt_id);


--
-- TOC entry 2968 (class 2606 OID 16551)
-- Name: ts_result ts_result_pkey; Type: CONSTRAINT; Schema: public; Owner: susan
--

ALTER TABLE ONLY public.ts_result
    ADD CONSTRAINT ts_result_pkey PRIMARY KEY (tsr_id);


--
-- TOC entry 2964 (class 2606 OID 16537)
-- Name: tt_result tt_result_pkey; Type: CONSTRAINT; Schema: public; Owner: susan
--

ALTER TABLE ONLY public.tt_result
    ADD CONSTRAINT tt_result_pkey PRIMARY KEY (ttr_id);


-- Completed on 2021-06-14 20:20:29 CST

--
-- PostgreSQL database dump complete
--

