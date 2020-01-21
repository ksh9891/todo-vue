<template>
    <div>
        <h1>ListComponent</h1>
        <AddComponent />
        <ul class="todo">
            <li v-for="item in items" v-bind:key="item.id">
                <ContentComponent v-bind:content="item.content" v-bind:reg-dated="item.regDated" />
            </li>
        </ul>
    </div>
</template>

<script>
    import ContentComponent from './ContentComponent';
    import AddComponent from './AddComponent'

    export default {
        name: "ListComponent",
        components: {
            ContentComponent,
            AddComponent
        },
        data: function() {
            return {
                items: JSON.parse(localStorage.getItem("http://localhost:8080"))
            }
        }
    }
</script>

<style scoped>
    .todo {
        list-style: none;
    }
</style>