<template>

    <v-card outlined>
        <v-card-title>
            CreateDelivery
        </v-card-title>

        <v-card-text>
            <String label="ManualId" v-model="value.manualId" :editMode="editMode"/>
            <String label="DeliveryAddress" v-model="value.deliveryAddress" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="createDelivery"
            >
                CreateDelivery
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'CreateDeliveryCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.manualId = '';
            this.value.deliveryAddress = '';
        },
        watch: {
        },
        methods: {
            createDelivery() {
                this.$emit('createDelivery', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

