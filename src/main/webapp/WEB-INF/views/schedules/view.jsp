<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../includes/header.jsp" %>
<div class="container-xl">
    <!-- Page title -->
    <div class="page-header d-print-none">
        <div class="row align-items-center">
            <div class="col">
                <div class="page-pretitle">
                    페이지
                </div>
                <h2 class="page-title">
                    일정 조회
                </h2>
            </div>
        </div>
    </div>
    <div class="row row-cards">
        <div class="col-12">
            <div class="card">
                <div class="card-body">
                    <p class="mb-0">
                        여기에 일정 캘린더 또는 목록을 표시합니다.
                    </p>
                                                            <div id="calendar"></div>
                    <script>
                        document.addEventListener('DOMContentLoaded', function() {
                            var calendarEl = document.getElementById('calendar');
                            var calendar = new FullCalendar.Calendar(calendarEl, {
                                initialView: 'dayGridMonth',
                                locale: 'ko', // 한국어 설정
                                headerToolbar: {
                                    left: 'prev,next today',
                                    center: 'title',
                                    right: 'dayGridMonth,timeGridWeek,timeGridDay'
                                },
                                // 예시 이벤트 (나중에 서버 데이터로 교체)
                                events: [
                                    {
                                        title: '팀 회의',
                                        start: '2025-12-25T10:00:00',
                                        end: '2025-12-25T12:00:00'
                                    },
                                    {
                                        title: '프로젝트 마감',
                                        start: '2025-12-28',
                                        allDay: true
                                    }
                                ]
                            });
                            calendar.render();
                        });
                    </script>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <script src='https://cdn.jsdelivr.net/npm/fullcalendar@6.1.19/index.global.min.js'></script>
                                        <%@ include file="../includes/footer.jsp" %>