<template>
    <div class="warp">
        <ListComponent />
    </div>
</template>

<script>
    import ListComponent from './components/ListComponent'

    export default {
        name: "app",
        components: {
            ListComponent
        }
    }

    // 서버 기동 시 기본 Sample 파일 저장 후 시작
    let initData = {
        1: {id: 1, content: 'Hello', regDated: '2019-01-01'},
        2: {id: 2, content: 'hhhhh', regDated: '2019-02-01'},
        3: {id: 3, content: 'ggggg', regDated: '2019-03-01'},
        4: {id: 4, content: 'ooooo', regDated: '2019-04-01'},
        5: {id: 5, content: 'qqqqq', regDated: '2019-05-01'},
        6: {id: 6, content: 'asdasd', regDated: '2019-08-01'},
    };
    localStorage.setItem("http://localhost:8080", JSON.stringify(initData))
</script>

<style>

</style>