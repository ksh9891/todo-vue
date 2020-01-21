<template>
    <div class="todoContentBox">
        <div class="left">
            {{ content }}
        </div>
        <div class="right">
            {{ reg-dated }}
        </div>
    </div>
</template>

<script>
    export default {
        name: "ContentComponent",
        props: ['content', 'reg-dated']
    }
</script>

<style scoped>
    .todoContentBox {
        display: flex;
        border: 1px solid #0a0015;
        padding: 5px;
    }
</style>